package com.service.impl;

import com.service.B;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: youys
 * @Date: 2020/7/15
 * @Description:
 */
@Component
@Scope("prototype")
public class BImpl implements B {
}
