struts2-velocity-layout
=======================
####struts中action和view之间的关系一般会是这样：action中会有某个方法对应一个目标页面，这个目标页面一般会是一整个页面，比如首页、列表页、详情页。
####而这里这个目标页面始终只有一个，就是模板页。action中的方法对应一个模板页，方法中会把子页面当参数一样传递到模板页中，模板页再使用velocity模板的#parse、#include载入子页面。
####如果说你的网页中有这种情况：每个页面的站头站脚都是一样的，这时如果用第一种方式，如果你把站头、站脚做成模块，那么你需要在每个目标页面中都去c:import、jsp:include一下这两个模块。如果用第二种方式的话，那么你只需要在模板页中#parse一下这两个模块，第二种方式显然更方便维护一些。
