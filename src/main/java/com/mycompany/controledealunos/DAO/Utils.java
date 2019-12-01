/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controledealunos.DAO;

/**
 *
 * @author Murilo
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Utils {

    public static List<String> filterListByTerm(List<String> list, String term) {

        List<String> matching;
        matching = list.stream()
                .filter(e -> e.toLowerCase().startsWith(term))
                .collect(Collectors.toList());

        return matching;
    }

    public static String list2Json(List<String> list) {

        String json = null;
        
        try {
            json = new ObjectMapper().writeValueAsString(list);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return json;
    }
}
