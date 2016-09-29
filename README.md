# Open Source Project Example

## Notes for Teachers

### Introduction

This is an example project skeleton for a [Wordle](http://www.wordle.net/), and lesson plans that teach collaboration on GitHub and open source concepts. [AP Computer Science A objective](http://media.collegeboard.com/digitalServices/pdf/ap/ap-computer-science-a-course-description.pdf) alignment markers are interspersed throughout this document.

This project skeleton is provided as-is. If you find that there is a bug in the original skeleton, you may raise an issue on GitHub at [https://github.com/jchuahtacc/oss-project-example/issues](https://github.com/jchuahtacc/oss-project-example/issues) or submit a fix using a pull request.

I really didn't test this code that much.

### Project Design

In designing this project skeleton, I used a couple principles:

- Have a "working" project skeleton, in the sense that it compiles
- Break apart work into many different files, to reduce merge conflicts when project tasks are subdivided
- Use abstract base classes so students can create multiple implementations and substitute them easily in the Main method.
- TODO markers so students can use the Task View in Eclipse to quickly identify where they need to code
- Use of Java standard APIs, so no libraries have to be installed... though students may have to do some Googling to understand how the APIs were used
- Non-original code is allowed, though attribution is a requirement. Analyzing and adapting code can fulfill the same learning objectives as implementing an algorithm from scratch, and code from a foreign project (event another group's) will rarely ever integrate perfectly without modification.

### Lesson Objectives

This is a list of objectives as they appear in the TODO lists of the project, with the aligned objective from the AP Computer Science A course outline.

1. Use a collection to store and retrieve data (I.A.2, II.A.3, IV.D, II.A.1)
2. Implement a sort (or, alternatively, implement a Comparator for Arrays.sort) (IV.E, V.C, II.A.1)
3. Override a parent constructor (I.A.3, II.A.1)
4. Iterate through an array to manipulate elements (IV.E, V.A, II.A.1)

### Possible Lesson Enhancements

I packaged this project for portability. It definitely can use the following enhancements, which may not necessarily apply to all classrooms. They can certainly be used as stretch goals for students that are extremely far in the curve.

- Unit Testing (III.A.2, III.D.2) using [JUnit](http://junit.org/) - to be honest, I've never seen any high school AP Computer Science course actually implement a true compile-time unit test.
- Collision Testing Optimization (III.E.1) - BaseRenderer.setEmptyLocation tries placing each word by using a parametric equation to generate a series of points along a spiral, at which point it "tries" to place each word by testing it against every word already on the screen. This is incredibly slow. I've implemented a Wordle using Javascript, where I used a [Quadtree to optimize collision detection](https://gamedevelopment.tutsplus.com/tutorials/quick-tip-use-quadtrees-to-detect-likely-collisions-in-2d-space--gamedev-374).
- Currently, all words are received from the keyboard. It is possible to use networking (or even a REST API that pushes data, such as Firebase) to store and receive words from other computers so that every user contributes to the same Wordle.

## Student Instructions

This Java desktop App is a Wordle generator. The user can add words. Words appear on the screen, exactly once. If a word is entered more than once, it is deemed more "important" and word size should increase. The project skeleton already includes a simple algorithm for automatically placing words where they will not overlap, so you don't have to worry about that part. It definitely can use some improvement, however.

### Before You Start

- Sign up for a GitHub account and follow the instructions in the verification email.
- Have the group leader fork this project
- In your fork, add your group's collaborators
- Download [GitHub Desktop](https://desktop.github.com/) for your platform and log in with your GitHub account
- Clone this project using GitHub Desktop somewhere. Don't move it from where you cloned it, otherwise GitHub desktop won't be able to track changes!
- In Eclipse, import this project as a "Git/Projects from Git" project, "Existing Local Repository"

### Project Structure

Look through the code with your group and describe how the following design goals have been achieved: (I.A.1, II.A.5)

- The project is organized using the Model-View-Controller paradigm (I.A.6)
- The Model components are responsible for storing and manipulating the Words (II.A.4)
- The View components are responsible for displaying the data (II.A.5)
- The Controller components are responsible for user interactions (II.B.2.e - Interfaces in the sense that it uses an inline, anonymous inner-class that implements the ActionListener interface, not because it's a "user interface.")
- Base classes are used to provide some functionality (II.A.3)
- It's up to you, the programmers, to decide how to store, retrieve and manipulate the data

Report to the class what you are able to understand about this project skeleton.

### TODO List

Look at each of the TODO items. Place a breakpoint in each of those method stubs. Run the project and try interacting with it. As each breakpoint triggers, see what event caused the method to be called. (III.B.3) Also analyze the call stack and see where the method was called. (II.B.4.a) After you have identified each of these function calls, decide which of your group members will be responsible for implementing each of these objectives.

### Branching and Committing

Before you begin work, create a branch for the objective that you are working on. Only modify files that deal directly with your objectives! As you make incremental changes and verify that they work, commit them. (III.A.1, III.A.3, III.D.1). When you believe you have completed your objective, submit a pull request to your group leader's master branch. (Don't submit the pull request up to jchuahtacc/oss-project-example! It will be ignored.)

### Integrating

As objectives become complete, the group leader may merge pull requests. Before you synchronize a merge from the upstream master, make sure that you commit or stash your changes!

### Stretch Goals

- Words are always drawn using the same color. Try randomizing the color of each word as it is drawn.
- Although the Wordle window is resizable, word placement on the screen does not respond to the size of the window. Try making the word placement responsive to the size of the screen.
- Try playing around with the placement of the words to see what looks "nicest", based on your font.

### Presenting

Present your project! Make sure that you have:

- Commented code
- If you didn't write a portion of your code, attribution to the author
- A description of how you chose to tackle each objective
- Unique features for your project fork

