# tp8

Auteur

Sylla Mariama Sere  et Diallo Alpha Abdoulaye
Objectifs

Obectif du TP (en termes de compétences)

Objectits atteints

j'ai acquise la manipulation des herttages ,des sous classes qui herite une classe mere   , , les l'ecriture du main ,les classes abstraites, la manipulation des heritags , l'utilisation du super constructeur ,  la modification d'une methode de la classe fille, la division d'un probleme en sous probleme ,la manipulation des methodes abstraites
Objectif non atteints et difficultés rencontrées (le cas échéant)

il ya des notions que je dois revoir sur les heritages.
Comment générer la documentation ?

Donner ici précisement les consignes, avec les vrais noms de fichier correspondants au TP en cours.
Je dois pouvoir compiler (à partir du dossier tp5) avec un simple copier-coller de la ou des commandes fournies.

javadoc -sourcepath src -subpackages goosegame  -d docs
Comment compiler les classes du tp6 ?


javac  -sourcepath src src/goosegame/*.java -d classes
Comment compiler puis exécuter les tests ?


javac   -classpath junit-console.jar:classes test/goosegame/*.java 


java  -jar junit-console.jar --class-path test:classes --scan-class-path 
Comment crééer le jar exécutable ?


jar cvfe goosegame.jar goosegame.GameMain -C classes .


Comment tester l'exécution du programme ?

Ici il s'agit de décrire et donner les commandes pour lancer le ou les main du TP.

 java -jar goosegame.jar

