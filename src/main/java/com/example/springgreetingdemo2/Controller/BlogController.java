package com.example.springgreetingdemo2.Controller;

import com.example.springgreetingdemo2.model.Blog;
import com.example.springgreetingdemo2.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ModelAndView listBlogs() {
        List<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewBlog(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ModelAndView("/error");
        }
        ModelAndView modelAndView = new ModelAndView("/blog/view");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ModelAndView("/error");
        }
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/blog";
    }
}
