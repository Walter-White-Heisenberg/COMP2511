# **Strategy Design Pattern**

**Algorithms can be selected during the Run-time, using composition**

**(Liskov principle) prefer Composite and Aggregate than Inheritance**

This is an Movie Renting example:
<br>1. Movies has three types: Childrens movie / New movie / Old movie</br>
<br>2. and there are different method to calculate the costs for the movie renting</br>
   each movie type has a Default cost method, however the owner of the renting shop can change the cost method as well
   e.g. Lion King is a new Movie now, after three months its going to be a Childrens movie
   the following are the methods:
   <ul>
   <li> 3 dollars for the first 5 days, after that its 2 dollars each day</li>
   <li> 5 dollars each day</li>
   <li> 2 dollars for the first 5 days, after that its 1 dollar each day</li>
   
   </ul>
