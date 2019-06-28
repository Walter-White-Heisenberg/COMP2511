# Lab 04

## Due: Week 4, Sunday, 5:00 pm

## Value: 1 mark

## Aim

* Become familiar with design patterns - strategy and state

## Setup

An individual repository for this lab has been created for you here (replace z5555555 with your own zID):

https://gitlab.cse.unsw.edu.au/z5555555/19T2-cs2511-lab04

## Exercise

Included in this repo is the code from this week's tutorial for the refactored movie rental example. This code uses the strategy pattern to price different movie rentals.

* Add a new type of movie, `Classic`. Classic movies can be rented for up to 5 days for $2. Each additional day after those 5 days costs $1.

Watch this video from our esteemed tutor Hugh on the state pattern.

https://www.soln.io/s/HJa84HRVW2j?course_id=B1RYiLjNX&series_id=H1dF7bo4m

After considering the differences between the state and strategy patterns:

* Modify the `Movie` class such that it uses the state pattern to track its pricing. In doing so you will need to consider:
  * What state a movie is in initially?
  Answer: the state of movie was Regular() in Customer class main()
  
  * What transitions can be made on the state?
  Answer: however, we want to change the state to Childrens()
  
  * How this affects the testing code in the `main()` method of the customer class.
  Answer: Instead of create a new Movie class with `Movie m = new movie ('title', new Childrens())`
  		  we can keep it same as `m('Title', price)`
  		  and use a change function `m.changePrice(price)` which is easier and more convenient

Check to make sure your solution conforms to the state pattern.

Modify this file (`README.md`) and, using your solution as an example, answer the following questions:

* What advantages does the state pattern have over the strategy pattern?

    > State pattern is about doing different things based on the state
      it allows us to switch from one state to another state easily (during run-time)

* Conversely, what disadvantages does the state pattern have over the strategy pattern?

    > the difference between state and strategy pattern is we call/change strategy with the strategy interface
      however we can switch the state by using the context class which is Movie in this case
      similarly, when there is a large number of state, developer need to write a large number of the state schema
      when there is multiple 'transition method', it requires too many methods in the system
      

## Submission

Make sure that all your work has been pushed to GitLab then submit it with:

```bash
$ 2511 submit lab04
```

