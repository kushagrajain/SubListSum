# This project will evaluate all possible subsets from an input list whose element sum is equal to input sum.

Please perform below steps to run the project - 
  1. Download ZIP/Clone project from repository
  2. Import the same as maven project in eclipse
  3. Build maven project, it will create war file under target directory (mvn clean install)
  4. This war file can be deployed in tomcat webapps dir
  5. Once tomcat is up and running, please type "http://localhost:8080/spring-sublist-sum/" for running the same.
  
The project home page asks for input list of integer and sum. On clicking submit, it will show the list of all subsets that matches to given sum.

Sample Input:

Please input the list of numbers: 7,3,9,8,4,5,2,10	
Please input the sum: 15

Sample Output: [[8, 7], [4, 8, 3], [5, 3, 7], [2, 4, 9], [2, 5, 8], [10, 5], [10, 2, 3]]
