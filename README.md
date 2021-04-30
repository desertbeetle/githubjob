# GITHUBJOBS

Giving a list of locations and languages, this program calculates the 
percentage of jobs of each programming language that are open at each location based 
on the information on GitHub Jobs API (https://jobs.github.com/api).

Sample Output
```
Boston:
- Java: 66.67%
- C#: 0.00%
- Python: 66.67%
- Swift: 0.00%
- Objective-C: 0.00%
- Ruby: 33.33%
- Kotlin: 0.00%
- Go: 66.67%
- C++: 33.33%
- Javascript: 33.33%
San Francisco:
- Java: 14.29%
- C#: 0.00%
- Python: 57.14%
- Swift: 0.00%
- Objective-C: 0.00%
- Ruby: 0.00%
- Kotlin: 0.00%
- Go: 71.43%
- C++: 14.29%
- Javascript: 14.29%
.
.
.

```


### Challenges
The suggested time for this exercise is 6 hours including unit tests and simple documentation. I have to be very focus on the core requirement 
although a lot of new features would have made this project more interesting.  

### Areas of code you are most proud of
The areas I am most proud of is dividing the program into layers and components and having each component test individually using unit test.

### Area of the code you are least proud of
Instead of creating new connection on every location/language pair, it may fetch all jobs near a location and do the language filtering locally.   

### Tradeoffs and why
At first, I wanted to use JAX-RS client api to access the REST service endpoint but the library setup didn't quite work. 
Finally, I switched to use Java URL connection and GSON to do the work and move on. 

### Next areas of focus to move this towards production
It depends on how the program is used. If it is aimed 
for customer, the final data may need to make available in JSON, XML 
for integration purpose. It is also necessary to add a service endpoint or library for data access.



