==deploy==
package -P module12_without_optional tomcat:deploy
package -P module12_with_optional tomcat:redeploy

==profiles==
-Pmodule12_with_optional clean package
-Pmodule12_without_optional package

==reporting==
clean site

==archetype generation===
archetype:create-from-project from the root folder

then go to target/generated-sources/archetype/
run install

go to some folder, e.g. installedArch
run archetype:generate -DarchetypeCatalog=local and choose an archetype from local repo