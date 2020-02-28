(ns clj-boost-demo.core
  (:require [clj-boost.core :as boost]
            [clojure.java.io :as io]
            [clojure.data.csv :as csv]))

(def iris-data "resources/resources_iris.csv")

(defn generate-iris [iris-data]
  (with-open [reader (io/reder iris-data)]
    (into []
      (comp (drop 1) (map #(split-at 4 %)))
      (csv/read-csv reader))))
