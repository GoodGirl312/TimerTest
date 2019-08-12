package com.designmodel.prototype;

import lombok.Data;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:07
 */
@Data
public class WorkExperience {
    String companyName;
    int workYear;

    public WorkExperience(String companyName, int workYear) {
        this.companyName = companyName;
        this.workYear = workYear;
    }

    public WorkExperience() {

    }
}
