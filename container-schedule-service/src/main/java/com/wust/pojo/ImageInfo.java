package com.wust.pojo;

import com.wust.pojo.harbor.Image;
import com.wust.pojo.harbor.Tag;
import lombok.Data;

import java.util.List;

@Data
public class ImageInfo {

    private Image image;
    private List<Tag> tags;
}
