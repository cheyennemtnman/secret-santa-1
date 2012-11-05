(ns secret-santa.people)

(def sample-people
  [{:name "Stan"     :email "stan.dyck@gmail"      :family 0}
   {:name "Laura"    :email "laura@example.com"    :family 0}
   {:name "George"   :email "george@example.com"   :family 1}
   {:name "Edna"     :email "edna@example.com"     :family 1}
   {:name "Brian"    :email "brian@example.com"    :family 2}
   {:name "Lynell"   :email "lynell@example.com"   :family 2}
   {:name "Sam"      :email "sam@example.com"      :family 2}
   {:name "Marcus"   :email "marcus@example.com"   :family 2}
   {:name "Janine"   :email "janine@example.com"   :family 3}
   {:name "Matt"     :email "matt@examplee.com"    :family 3}
   {:name "ChaeYoon" :email "chaeyoon@example.com" :family 3}
   {:name "Jon"      :email "jon@example.com"      :family 4}
   {:name "Lisa"     :email "lisa@example.com"     :family 4}
   {:name "Simon"    :email "simon@example.com"    :family 4}
   {:name "Seth"     :email "seth@example.com"     :family 4}])

(def sample-last-recipients
  {:Stan     :George
   :Laura    :Seth
   :George   :Lisa
   :Edna     :Janine
   :Brian    :Simon
   :Lynell   :Matt
   :Sam      :Laura
   :Marcus   :Jon
   :Janine   :Marcus
   :Matt     :Edna
   :ChaeYoon :Lynell
   :Jon      :Brian
   :Lisa     :Stan
   :Simon    :ChaeYoon
   :Seth     :Sam})
