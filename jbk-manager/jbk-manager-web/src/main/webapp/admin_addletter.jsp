<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">

  <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
    <input type="hidden" name="adid" value="123">

    <table style="width:100%;">
      <tr>
        <td class="label">用户级别：</td>
        <td>
          <select id="cc"   class="easyui-combobox" name="lv" style="width:200px;">
            <option value="1" >--排长--</option>
            <option value="2">--连长--</option>
            <option value="3">--营长--</option>
            <option value="4">--团长--</option>
            <option value="5">--旅长--</option>
            <option value="6">--师长--</option>
            <option value="7">--军长--</option>
            <option value="8">--司令--</option>
            <%-- <c:forEach items="${requestScope.jobs }" var="job">
               <option value="${job.id }">${job.name }</option>
             </c:forEach>--%>
          </select>
        </td>
      </tr>

     <%-- <tr>
        <td class="label">商品卖点：</td>
        <td>
          <input class="easyui-textbox" type="text" id="sellPoint" name="sellPoint"
                 data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;">
        </td>
      </tr>--%>
      <tr>
        <td class="label">用户名(可不填)：</td>
        <td>
          <input class="easyui-numberbox" type="text" id="loginName" name="loginName">
        </td>
      </tr>
      <tr>
        <td class="label">信息标题：</td>
        <td>
          <input class="easyui-textbox" type="text" id="title" name="title"
                 data-options="required:true" style="width:100%">
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <!-- 加载编辑器的容器 -->
          <script id="container" name="context" type="text/plain">信息内容</script>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <button onclick="submitForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-ok'">保存</button>
          <button onclick="clearForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-undo'">重置</button>
        </td>
      </tr>
    </table>

  </form>
</div>


<!-- 实例化编辑器 -->
<script type="text/javascript">





  var ue = UE.getEditor('container',{
    initialFrameWidth: '100%',
    initialFrameHeight: '400'
  });

  function submitForm(){
    $('#itemAddForm').form('submit', {
      //提交表单动作的URL地址
      url: 'addletter',
      //在提交之前触发，返回false可以终止提交
   /*   onSubmit: function(){
        $('#price').val($('#priceView').val()*100);
        return $(this).form('validate');
      },*/
      //在表单提交成功以后触发
      success:function(data){

        if (data>0){

            $.messager.alert('消息','添加成功！','info',function(){
                window.location.href = 'yao';
            });

        }else{
            $.messager.alert("消息","该用户不存在，请重新输入！");
        }

      }
    });
  }

  //重置页面
  function clearForm(){
    $('#itemAddForm').form('reset');
    ue.setContent('');
  }
</script>