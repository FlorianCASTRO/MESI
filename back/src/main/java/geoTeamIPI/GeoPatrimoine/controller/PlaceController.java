package geoTeamIPI.GeoPatrimoine.controller;

import geoTeamIPI.GeoPatrimoine.repository.PlaceRepository;
import geoTeamIPI.GeoPatrimoine.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @Autowired
    private PlaceRepository placeRepository;


    // will return only the places displayable by the map
    //parameters : 4 points, one for each corner of the screen.
    //todo: js side and db request
    @RequestMapping("places")
    public String showFilteredPlacesOnMap( ) {

        List places = placeRepository.findAll();

        return "pouet";
    }
}
