# codefellowship
> The hot spot for fellowshipping with your code fellows.

## How to Run
1. Clone the repo.
2. Install gradle.
3. Build the repo via ./gradlew build
4. Run the server via .gradlew bootRun
5. Open local server in the browser at localhost:8080.


## Updates
### Codefellowship 1.0 (Lab 16: CodeFellowship Profiles)
> Build an app that allows users to create their profile on CodeFellowship.

#### Feature Tasks
-[X] The site should have a splash page at the root route (/) that contains basic information about the site, as well as a link to the “sign up” page.
-[X] An ApplicationUser should have a username, password ( hashed using BCrypt), firstName, lastName, dateOfBirth, bio, and any other fields you think are useful.
-[X] The site should allow users to create an ApplicationUser on the “sign up” page.
    -[X] Your Controller should have an @Autowired private PasswordEncoder passwordEncoder; and use that to run passwordEncoder.encode(password) before saving the password into the new user.
-[X] The site should have a page which allows viewing the data about a single ApplicationUser, at a route like /users/{id}.
    -[X] This should include a default profile picture, which is the same for every user, and their basic information.
-[X] Using the above cheat sheet, add the ability for users to log in to your app.
    -[ ] Upon logging in, users should be taken to a /myprofile route that displays their information.
-[X] Ensure that your homepage, login, and registration routes are accessible to non-logged in users. All other routes should be limited to logged-in users.
-[X] Ensure that user registration also logs users into your app automatically.
-[ ] The site should be reasonably styled. (This can be using CSS that you did not create yourself.)
-[ ] The site should contain integration testing. At a minimum, there should be tests to ensure basic functionality for the splash page and the sign up page.


### Codefellowship 1.2 (Lab 17: Spring Authorization)
> Today, you’ll add login to the CodeFellowship app, and allow users to create posts.

#### Feature Tasks
-[X] Using the above cheat sheet, add the ability for users to log in to your app.
    -[ ] Upon logging in, users should be taken to a /myprofile route that displays their information.
-[X] Ensure that your homepage, login, and registration routes are accessible to non-logged in users. All other routes should be limited to logged-in users.
-[X] Ensure that user registration also logs users into your app automatically.
-[ ] Add a Post entity to your app.
    -[ ] A Post has a body and a createdAt timestamp.
    -[ ] A logged-in user should be able to create a Post, and a post should belong to the user that created it.
-[ ] A user’s posts should be visible on their profile page.
-[ ] When a user is logged in, the app should display the user’s username on every page (probably in the heading).