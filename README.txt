==deploy==
#plugin executes on install
install -P module12_with_optional
install -P module12_without_optional

==profiles==
-Pmodule12_with_optional clean package
-Pmodule12_without_optional package

==reporting==
clean site - report will be built for service module

==archetype generation===
archetype:create-from-project from the root folder

then go to target/generated-sources/archetype/
run install

go to some folder, e.g. installedArch
run archetype:generate -DarchetypeCatalog=local and choose an archetype from local repo