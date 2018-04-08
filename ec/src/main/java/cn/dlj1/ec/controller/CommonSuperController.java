package cn.dlj1.ec.controller;

import cn.dlj1.ec.pojo.entity.Entity;
import cn.dlj1.ec.service.SuperService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface CommonSuperController<T extends Entity> extends SuperController<T> {

    // 默认入口页面
    String DEFAULT_PAGE = "page";
    // 新增页面
    String DEFAULT_ADD_PAGE = "add";
    // 修改页面
    String DEFAULT_EDIT_PAGE = "edit";
    // 查看页面
    String DEFAULT_VIEW_PAGE = "view";
    // 导出页面
    String DEFAULT_LEAD_OUT_PAGE = "leadOut";


    /**
     * 设置服务
     *
     * @param service
     */
    void setService(SuperService<T> service);

    /**
     * 获取服务
     *
     * @return
     */
    SuperService<T> getService();

    /**
     * 获取这个业务模块的目录路径
     */
    String getPath();

    /**
     * 重定向到项目其他路径
     */
    String redirect(String page);

    /**
     * 获取本模块下的页面mvc
     */
    ModelAndView getPage(String pagePath);

    /**
     * 每个模块的首页
     */
    ModelAndView moduleIndex(HttpServletRequest request);

    /**
     * 上传
     */
    String upload(HttpServletRequest request, MultipartFile ele);

    /**
     * 导出页面
     */
    ModelAndView leadOutP(HttpServletRequest request);

    /**
     * 导出
     */
    void leadOut(HttpServletRequest request, HttpServletResponse response, String cnds, String[] fields,
                 String sortField, String sortType, int nowPage, int pageSize);

    /**
     * 新增页面
     */
    ModelAndView addPage(HttpServletRequest request);

    /**
     * 新增
     */
    String add(HttpServletRequest request, T entity);

    /**
     * 删除
     */
    String delete(HttpServletRequest request, int... ids);

    /**
     * 修改页面
     */
    ModelAndView editPage(HttpServletRequest request, int id);

    /**
     * 修改
     */
    String edit(HttpServletRequest request, T entity);

    /**
     * 查看页面
     */
    ModelAndView viewPage(HttpServletRequest request, int id);

    /**
     * 数据
     */
    String view(HttpServletRequest request, int id, String... returnFields);

    /**
     * 对外开放的选择页面
     *
     * @param request
     * @return
     */
    ModelAndView choose(HttpServletRequest request);

    /**
     * 通过一个字段返回返回这条数据的另一个字段值
     *
     * @return
     */
    String single(HttpServletRequest request, String field, Object value, String returnField);

    /**
     * 默认入口页面
     *
     * @param request
     * @return
     */
    ModelAndView page(HttpServletRequest request);

    /**
     * 数据表格
     *
     * @param request
     * @param cndsJson
     * @param sortField
     * @param sortType
     * @param nowPage
     * @param pageSize
     * @return
     */
    String page(HttpServletRequest request, String cndsJson, String sortField, String sortType, int nowPage, int pageSize, String... returnFields);

}
