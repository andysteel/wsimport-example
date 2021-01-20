# wsimport-example
An example how to use wsimport tool from  Java jdk to create soap client automatic

<p>The example below is considering use a relative path from jdk 8 installation to execute the wsimport command:</p>


<p>D:\java8\jdk8u275-b01\bin\wsimport -keep -p client2 -verbose https://www.dataaccess.com/webservicesserver/NumberConversion.wso?wsdl</p>

<p>This command read the wsdl file and generate all the java files to create a client to call the soap service, after just copy these files to your project and make the adjustments for your packages</p>

<p>See the example project</p> 
