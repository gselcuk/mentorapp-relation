package com.obss.mentor.expertise.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@Data
@Builder
public class ListRelationResponse {

  List<RelationResponse> listRelation;
}
