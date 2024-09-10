package kennyboateng.u5w3d2.services;

import kennyboateng.u5w3d2.Excepions.NotFoundException;
import kennyboateng.u5w3d2.entities.Blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlogServices {

    private List<Blog> blogList = new ArrayList<>();

    public List<Blog> getBlogList() {
        return this.blogList;
    }

    public Blog savedBlog (Blog body){
        Random rdm = new Random();
        body.setId(rdm.nextInt(1,1000));
        this.blogList.add(body);
        return body;
    }
    public Blog findbyID(int blogId){
        Blog found = null;
        for (Blog blog:this.blogList){
            if (blog.getId() == blogId) found = blog;
        }
        if (found== null)throw new NotFoundException(blogId);
        return found;
    }
    public Blog findByBlogAndUpdate(int blogId,Blog updateblog){
        Blog found =  null;
        for (Blog blog:this.blogList){
            if (blog.getId() == blogId){
                found = blog;
                found.setTitolo(updateblog.getTitolo());
                found.setCategoria(updateblog.getCategoria());
                found.setContenuto(updateblog.getContenuto());
                found.setCover(updateblog.getCover());
                found.setTempo_lettura_min(updateblog.getTempo_lettura_min());

            }

        }
        if (found==null) throw new NotFoundException(blogId);
        return found;
    }

    public void findByIdAndDelete(int blogId){
        Blog found = null;
        for (Blog blog:this.blogList){
            if(blog.getId()==blogId)found=blog;
        }
        if(found == null)throw new NotFoundException(blogId);
        this.blogList.remove(found);
    }
    }

