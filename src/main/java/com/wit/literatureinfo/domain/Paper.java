package com.wit.literatureinfo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Paper {
    double id;
    String title;
    String abstract_content;
    String pdf_url;
    String date;
}
