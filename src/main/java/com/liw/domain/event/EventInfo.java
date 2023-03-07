package com.liw.domain.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventInfo {
   private String sub;
   private String object_class;
   private String army;
   private String relation;
   private String loc;
   private String time;
   private String source;
   private String event_class;
   private String origin_sentence;
}
