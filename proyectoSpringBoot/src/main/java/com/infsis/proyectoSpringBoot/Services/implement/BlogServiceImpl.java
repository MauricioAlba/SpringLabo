package com.infsis.proyectoSpringBoot.Services.implement;

import com.infsis.proyectoSpringBoot.DTOs.BlogDTO;
import com.infsis.proyectoSpringBoot.Models.Blog;
import com.infsis.proyectoSpringBoot.Services.BlogService;


import java.util.Optional;

public class BlogServiceImpl implements BlogService{

    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {

    }

    private  BlogDTO BlogtoDto(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getName()
        );
        return blogDTO;
    }


    private Blog DtoToBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());

        return blog;
    }
}
