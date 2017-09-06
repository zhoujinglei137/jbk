/*$('#menu .easyui-tree').tree({
 onClick: function(node){

 var tab = $('#tab').tabs('getTab', node.text);
 console.log(tab);

 if(!tab){
 //如果没有就创建
 $('#tab').tabs('add',{
 title: node.text,
 closable: true
 });

 }else{
 //如果有就选中
 $('#tab').tabs('select', node.text);
 }

 }
 });*/

var ttshop = {
    registerMenuEvent: function () {
        $('#menu .easyui-tree').tree({
            onClick: function (node) {
                console.log(node);
                var href = node.attributes.href;
                $('#tab').tabs('close', 1);
                $('#tab').tabs('add', {
                    title: node.text,
                    href: href,
                    closable: true
                });
            }
        });
    }
};



