(defproject org.iplantc/lein-iplant-cmdtar "0.1.2"
  :eval-in-leiningen true
  :description "Leiningen plugin for generating tarball command distributions."
  :url "https://github.com/iPlantCollaborativeOpenSource/lein-iplant-cmdtar"
  :license {:name "BSD"
            :url "http://iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :scm {:connection "scm:git:git@github.com:iPlantCollaborativeOpenSource/facepalm.git"
        :developerConnection "scm:git:git@github.com:iPlantCollaborativeOpenSource/facepalm.git"
        :url "git@github.com:iPlantCollaborativeOpenSource/facepalm.git"}
  :pom-addition [:developers
                 [:developer
                  [:url "https://github.com/orgs/iPlantCollaborativeOpenSource/teams/iplant-devs"]]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [fleet "0.9.5"]]
  :repositories [["sonatype-nexus-snapshots"
                  {:url "https://oss.sonatype.org/content/repositories/snapshots"}]
                 ["sonatype-nexus-staging"
                  {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"}]])
