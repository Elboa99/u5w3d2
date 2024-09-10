package kennyboateng.u5w3d2.controllers;


import kennyboateng.u5w3d2.entities.Blog;
import kennyboateng.u5w3d2.services.BlogServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogContollers {

    // 1. GET http://localhost:3001/blog
    @GetMapping
    private List<Blog> getAllBlogs(){
        return blo
    }

    // 2. GET http://localhost:3001/blog%7Bblogid%7D
    @GetMapping("/{blogid}")
    private String getBlogById(@PathVariable int blogId){
        return ;
    }

    // 3. POST http://localhost:3001/(+body)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String createBlog(@RequestBody Blog body){
        return "Blog creato!";
    }

    // 4. PUT http://localhost:3001/%7Bblogid%7D(+body)
    @PutMapping("/{blogid}")
    private String findBlogByIdAndUpdate(@PathVariable int blogId,@RequestBody Blog body){
        return "Hai modificato il blog!";
    }


    // 5. DELETE http://localhost:3001/%7Bblogid%7D
    @DeleteMapping("/{blogid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private String deleteBlog(@PathVariable int blogId){
        return "Hai eliminato il blog!";
    }
}
