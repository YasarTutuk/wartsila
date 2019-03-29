# Java interview task

## Sprint 1
- Make an endpoint (GET /posts) that returns a list of all posts from an endpoint (https://jsonplaceholder.typicode.com/posts)
- Sort results alphabetically by title
- Allow filtering by title with ?title=[substring]



## Sprint 2
- Modify the endpoint to include the user object as part of the post object
    e.g.
    {
        ..post data
        user: {
            ..user data
        }
    }
- users can be loaded from (https://jsonplaceholder.typicode.com/users)

- Add pagination support (?limit=[]&offset=[])