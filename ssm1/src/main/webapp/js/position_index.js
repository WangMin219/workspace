// 立即加载
$(function(){
	getJurisdiction(-1)
	
	getAllPosition()
})


function getAllPosition(){
	$.ajax({
		Type : 'GET',
		url : 'emm_position/getAllPosition',
		
		success : function(result){
			console.log(result)
			
			var emm_position = result.extend.Emm_position_list;
			
			var emm_positionStr = ""
			$.each(emm_position,function(index,item){
				emm_positionStr = ""
				emm_positionStr += '<td>'+item.positionId
									+'</td><td>'+item.positionLevel
									+'</td><td>'+item.positionName
									+'</td><td>'+new Date(item.createTime).Formatter('yyyy-MM-dd hh:mm:ss')
									+'</td><td>'+new Date(item.updateTime).Formatter('yyyy-MM-dd hh:mm:ss')+'</td>'
									+'<td><div class="col-lg-20"><button type="button" id="updatebtn" name="updatebtn" class="btn btn-warning btn-sm" onclick="updateposition('+item.positionId+')">修改</button><button type="button" id="delbtn" name="delbtn" class="btn btn-danger btn-sm" onclick="deleteposition('+item.positionId+')">删除</button><button type="button" id="linkbtn" name="linkbtn" class="btn btn-success btn-sm" onclick="showselectmodel('+item.positionId+')">关联职位</button></div></td>';
			
				$('<tr></tr>').append(emm_positionStr).appendTo("#emm_position_list")
			})
			
			
		},
		
		error : function(){
			alert("请求失败")
		}
		
		
		
	});
}

function updateposition(positionID){
	top.location = 'jsp/systemSettings/position/update.jsp?positionID='+positionID
}


function showselectmodel(positionId) {
	$("#myModal").modal("show");
	$("#referencepositionId").val(positionId);
}