package com.serendipity.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DingData {
    private String id;

    private Date gmt_create;

    private Date gmt_modified;

    private String subscribe_id;

    private String corp_id;

    private String biz_id;

    private Integer biz_type;

    private List biz_data;

    private Long open_cursor;

    private Integer status;
}
