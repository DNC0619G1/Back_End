//package com.codegym.service.impl;
//
//import com.codegym.dao.entity.Movie;
//import com.codegym.dao.repository.MovieRepository;
//import com.codegym.service.MovieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MovieServiceImpl implements MovieService {
//    @Autowired
//    public MovieRepository movieRepository;
//
//    @Override
//    public List<Movie> getNameMovie(String name) {
//        return movieRepository.findAllByNameMovieContaining( name );
//    }
//}
