/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 恒宇少年
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.gitee.hengboy.mybatis.enhance.mapper.insert;

import com.gitee.hengboy.mybatis.enhance.common.annotation.ProviderMapper;
import com.gitee.hengboy.mybatis.enhance.exception.EnhanceFrameworkException;
import com.gitee.hengboy.mybatis.enhance.provider.insert.OrmInsertProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/4/8
 * Time：下午11:18
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@ProviderMapper
public interface InsertMapper<T, Id extends Serializable>
        extends
        InsertCollectionMapper<T, Id>,
        InsertArrayMapper<T, Id> {

    /**
     * 添加数据
     * SQL Provider To @see com.sanmi.framework.orm.core.provider.OrmInsertProvider#insert
     *
     * @param t 将要持久化的对象实例
     * @throws EnhanceFrameworkException 抛出框架异常
     */
    @InsertProvider(type = OrmInsertProvider.class, method = "empty")
    void insert(@Param("bean") T t) throws EnhanceFrameworkException;
}
