/**
 * Created by Administrator on 2017/9/12.
 */
var yao={
    add_Tab:function(title,href,id){
        if($('#tab').tabs('exists',title)){
            $('#tab').tabs('select',title)
        }else{
            if(id==undefined){
                id=0;
            }
            $('#tab').tabs('add', {
                title: title,
                href: href+"?id="+id,
                closable: true
            });
        }
    },
    closeTab:function(title){
        $('#tab').tabs('close',title);
    }
}