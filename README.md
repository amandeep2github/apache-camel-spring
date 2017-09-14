# spring-camel
setting up
create a remote git hub repo
created a local spring camel project
git init //to create local repo
git remote add origin <git repo url>
git add .
git commit -m "initial commit"
git branch --set-upstream-to=origin/master master
git push -f origin master


http://fabian-kostadinov.github.io/2016/01/10/reading-from-and-writing-to-files-in-apache-camel/

On mac the path worked is
file:/Users/amandeepsingh/CodeConcepts/Spring/github/spring-camel/src/main/resources/?fileName=camel-input-1.txt&noop=true

on window it was starting with
file://c:/<rest of the path>

Application needs to keep running otherwise camel route doesn't get time to pick the file. 
So extended CommandLineRunner Spring boot class