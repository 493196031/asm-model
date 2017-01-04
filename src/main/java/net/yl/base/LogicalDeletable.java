package net.yl.base;

/**
 * 可逻辑删除标记
 * @author yl
 * @date 2016年12月29日
 */
public interface LogicalDeletable {

    /**
     * 判断是否已逻辑删除
     * @return 逻辑删除标志
     */
    boolean isDeleted();
    
    /**
     * 设置是否逻辑删除标志
     * @param deleted 逻辑删除标志
     */
    void setDeleted(boolean deleted);
    
}
