==deploy==
package -P module12_without_optional tomcat:deploy
package -P module12_with_optional tomcat:redeploy

==profiles==
-Pmodule12_with_optional clean package
-Pmodule12_without_optional package

==reporting==
clean site -P report

