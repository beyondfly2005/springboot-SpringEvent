### 版本一 主要问题
#### 1、 发布者一侧
##### (1) 必须实现 ApplicationEventPublisherAware这个接口
##### (2) 发布者必须定义私有成员变量 ApplicationEventPublisher 并且实现其 set()方法
 
#### 2、 接收者一侧（监听器）
##### (1) 必须实现ApplicationListener<UserDelEvent>这个接口 
##### (2) 必须重写onApplicationEvent()方法 
##### (2) 方法内要做强制转换：UserModel userModel=(UserModel)userAddEvent.getSource();