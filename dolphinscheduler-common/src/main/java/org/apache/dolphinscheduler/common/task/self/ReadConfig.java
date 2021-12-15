/*
 * Aloudata.com Inc.
 * Copyright (c) 2021-2021 All Rights Reserved.
 */

package org.apache.dolphinscheduler.common.task.self;

import lombok.Data;

/**
 * @author eye.gu@aloudata.com
 * @version 1
 * @date 2021-12-14 11:04
 */
@Data
public class ReadConfig {
    private String type;
    private String jdbcUrl;
    private String userName;
    private String password;
    private String path;
    private MetaData metaData;
}