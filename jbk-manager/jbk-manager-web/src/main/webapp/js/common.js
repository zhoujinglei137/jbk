
var ttshop = {

    //响应导航树上的动作
    registerMenuEvent: function () {
        var _this = this;
        $('#menu .easyui-tree').tree({
            onClick: function (node) {
                var href = node.attributes.href;
                _this.addTab(node.text,href);
            }
        });
    },
    //添加选项卡
    addTab:function(title,href){
        if($('#tab').tabs('exists',title)){
            $('#tab').tabs('select',title)
        }else{
            $('#tab').tabs('add', {
                title: title,
                href: href,
                closable: true
            });
        }
    },
    //关闭选项卡
    closeTab:function(title){
        $('#tab').tabs('close',title);
    }
};



