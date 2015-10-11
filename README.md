###Android事件分发消费机制
####相关的三个类：
Activity，ViewGroup，View(这里特指不包含子控件的View)。

####相关的三个方法有：
dispatchTouchEvent，onInterceptTouchEvent，onTouchEvent。

####它们的对应关系如下：
| Touch事件相关方法 | 方法功能| Activity  |ViewGroup | View |
| -----|:-----:| -----:|:-----:| -----:|
| dispatchTouchEvent| 事件分发 | Yes|Yes|Yes
| onInterceptTouchEvent| 事件拦截| No|Yes|No|
| onTouchEvent|事件响应| Yes |Yes|Yes

####dispatchTouchEvent
1. return false; 
 - Activity：该事件不再传递给任何控件的任何方法。后续其他事件只能传递给该Activity的dispatchTouchEvent方法。
 - ViewGroup或View：该事件不再传递给任何控件的任何方法。后续其他事件不再传递给该控件的任何方法。
2. return true;
 - 该事件不再传递给任何控件的任何方法。后续其他事件只能传递给该控件的dispatchTouchEvent方法。
3. return super.dispatchTouchEvent(event);
 - Activity：调用ViewGroup或View的dispatchTouchEvent方法。
 - ViewGroup：调用该ViewGroup的onInterceptTouchEvent方法。
 - View：调用该View的onTouchEvent方法。

####onInterceptTouchEvent
1. return false; 
 - 如果是被点击的控件，调用父控件的onTouchEvent方法。
 - 如果是不被点击的控件，调用子控件的dispatchTouchEvent方法。
2. return true;
 - 调用该控件的onTouchEvent方法。
3. return super. onInterceptTouchEvent(event);
 - 如果是被点击的控件，调用该控件的onTouchEvent方法.
 - 如果不是被点击的控件，调用子控件的dispatchTouchEvent方法。

####onTouchEvent
1. return false;
 - 调用父控件的onTouchEvent方法。 
2. return true;
 - 该事件不再被传递。
3. return super. onTouchEvent(event);
 - 和return false;相同。

####举个例子


![](http://upload-images.jianshu.io/upload_images/55046-108cc3fb96b72bbd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

点击MiddleViewGroup，各个控件各个方法均返回super.onXXX。
结果如下：

![](http://upload-images.jianshu.io/upload_images/55046-0902d990afce8c13.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

可以修改各个控件的各个方法返回值验证上述结论哦。
