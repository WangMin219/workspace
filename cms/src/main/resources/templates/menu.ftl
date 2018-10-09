<div class="navbar navbar-fixed-top scroll-hide">
    <div class="container-fluid top-bar">
        <div class="pull-right">
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown notifications hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span
                        aria-hidden="true" class="se7en-flag"></span>

                    <div class="sr-only">Notifications</div>
                </a></li>
                <li class="dropdown messages hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span
                        aria-hidden="true" class="se7en-envelope"></span>

                    <div class="sr-only">Messages</div>
                </a></li>
                <li class="dropdown user hidden-xs"><a data-toggle="dropdown" class="dropdown-toggle" href="#"> <img
                        width="34" height="34" src="/picture/2_avatar_middle.jpg"><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/updatePd"><i class="icon-signout"></i>修改密码</a></li>
                        <li><a href="/logout"><i class="icon-signout"></i>Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <button class="navbar-toggle">
            <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
        </button>
        <a class="logo" href="#">weiboxs</a>
    </div>
    <div class="container-fluid main-nav clearfix">
        <div class="nav-collapse">
            <ul class="nav" id="menu">


            </ul>
        </div>
    </div>
</div>

<script id="sysSet_script" type="text/x-jquery-tmpl">
<#noparse>
  <li class="current">
  <a href="javascript:;" class="" data-toggle="dropdown"
                                       data-hover="dropdown" id="sysli">
                    <span aria-hidden="true" class='${pictures}'></span> ${menu_name}<b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                    {{each(i,e) sonList}}
                        <li><a href='${e.menu_url}' class="">
                        ${e.menu_name}
                        </a></li>
                        {{/each}}
                    </ul>
</li>
</#noparse>








</script>

<script id="proMange_script" type="text/x-jquery-tmpl">
<#noparse>
  <li class="current"><a href="javascript:;" class="" data-toggle="dropdown"
                                       data-hover="dropdown" id="sysli">
                    <span aria-hidden="true" class='${pictures}'></span> ${menu_name}<b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                    {{each(i,e) sonList}}
                        <li><a href="${e.menu_url}" class="">
                        ${e.menu_name}
                        </a></li>
                        {{/each}}
                    </ul>
</li>
</#noparse>








</script>

<script id="perWork_script" type="text/x-jquery-tmpl">
<#noparse>
<li class=""><a href="javascript:;" class="" data-toggle="dropdown" data-hover="dropdown">
                    <span aria-hidden="true" class="${pictures}"></span> ${menu_name}<b class="caret"></b>
                </a>
                    <ul class="dropdown-menu">
                    {{each(i,e) sonList}}
                        <li><a href="${e.menu_url}" class="">
                        ${e.menu_name}
                        </a></li>
                        {{/each}}
                    </ul>
</li>
</#noparse>








</script>


<script id="custormer_script" type="text/x-jquery-tmpl">
<#noparse>
<li class=""><a href="javascript:;" class="" data-toggle="dropdown" data-hover="dropdown">
                    <span aria-hidden="true" class="${pictures}"></span> ${menu_name}<b class="caret"></b>
                </a>
                    <ul class="dropdown-menu">
                    {{each(i,e) sonList}}
                        <li><a href="${e.menu_url}" class="">
                        ${e.menu_name}
                        </a></li>
                        {{/each}}
                    </ul>
</li>
</#noparse>








</script>


<script id="console_script" type="text/x-jquery-tmpl">
<#noparse>
<li class="">
                    <a href="${menu_url}" class="">
                    <span aria-hidden="true" class="${pictures}"></span>${menu_name}
                </a>

</li>
</#noparse>








</script>


<script type="text/javascript">
    $(function () {
        $.ajax({
            type: 'post',
            url: '/getMenu',
            cache: false,
            contentType: 'application/json;charset=UTF-8',
            dataType: "json",
            sync: true,
            success: function (result) {
                //系统设置菜单
                var sysSetArr = [];
                var sysSet = result[0]
                if (sysSet != undefined) {
                    sysSetArr.push(sysSet[0]);
                    $("#sysSet_script").tmpl(sysSetArr).appendTo("#menu");
                }
                //个人办公
                var perWorkArr = []
                var perWork = result[1]
                if (perWork != undefined) {
                    perWorkArr.push(perWork[0]);
                    $("#perWork_script").tmpl(perWorkArr).appendTo("#menu");
                }

                //客户管理
                var custormerArr = []
                var custormer = result[2]
                if (custormer != undefined) {
                    custormerArr.push(custormer[0]);
                    $("#custormer_script").tmpl(custormerArr).appendTo("#menu");
                }

                //产品管理
                var proMangeArr = []
                var proMange = result[3]
                if (proMange != undefined) {
                    proMangeArr.push(proMange[0]);
                    $("#proMange_script").tmpl(proMangeArr).appendTo("#menu");
                }

                //控制台
                var consoleArr = []
                var consol = result[4]
                if (consol != undefined) {
                    consoleArr.push(consol[0]);
                    $("#console_script").tmpl(consoleArr).appendTo("#menu");
                }
            }
            ,
            error: function () {
                alert("请求失败!");
            }
        })
    })
</script>