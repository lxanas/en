# 代码内容简介
DAO用于和数据库直接交互
Service负责业务逻辑，通过调用各种方法对DAO取得数据进行操作
Controller负责数据交互，接收前端发来的数据后调用Service获得处理结果并返回结果


#整体开发方向
前端开发组件、后端开发控制器，调试功能

#项目情况
目前整个项目只有一个index页面，所有内容在该页面中动态渲染。


#错误记录
单页面应用，之前通过配置 ErrorPage，实际上访问所有路径都会重定向到 /index.html 。我们直接在浏览器地址栏输入 /index 会触发拦截器，经过拦截器重定向到 /login，然后 /login 再经过 Configurer 的判断，再次触发拦截器，由于不在需要拦截的路径中，所以被放行，页面则重新定向到了 /index.html，如果没有再 Configurer 中取消对 /index.html 的拦截，则会再次触发拦截器，再次重定向到 /login，引发“重定向次数过多”错误。
