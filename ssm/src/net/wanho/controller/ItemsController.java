package net.wanho.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import net.wanho.pojo.Items;
import net.wanho.pojo.User;
import net.wanho.service.ItemsService;
import net.wanho.service.UserService;
import net.wanho.vo.ItemsModel;
import net.wanho.vo.QueryVo;

@Controller
public class ItemsController {

	@Resource
	private ItemsService itemsService;
	@Resource
	private UserService userService;

	@RequestMapping("home")
	public String home()  {
		return "login";
	}
	//handler
	@RequestMapping("list")
	public ModelAndView itemlist() throws Exception {

		List<Items> list = itemsService.selectAllItems();
		ModelAndView md = new ModelAndView();
		md.addObject("itemList", list);
		md.setViewName("itemList");
		return md;

	}

	@RequestMapping("update")
	public ModelAndView update(Items items, MultipartFile file,HttpServletRequest req) throws Exception {
		System.out.println("更新商品信息");
		/*List<Items> list = items.getItems();
		System.out.println("length="+list.size());*/
		//文件名
		String filename= file.getOriginalFilename();
			if("".equals(filename)){
					System.out.println("未修改图片");
			}else{
				
				System.out.println("文件名:"+filename);
				//上传地址
				String path = req.getSession().getServletContext().getRealPath("/images");
				System.out.println(path);
				
				//文件传输保存
				File dir = new File(path,filename);
				if(!dir.exists()){
					dir.mkdirs();
				}
				file.transferTo(dir);
				items.setPic(filename);
			}
				
		itemsService.updateItem(items);
		return itemlist();

	}

	/* 接收id 就行item查询 按照id进行查询 查完之后 我需要去editItem.jsp */
	@RequestMapping("itemEdit")
	public String itemEdit(Integer id, Model model) throws Exception {

		Items item = itemsService.findItemById(id);
		model.addAttribute("item", item);

		return "editItem";

	}

	@RequestMapping("queryitem")
	public ModelAndView queryitem(QueryVo vo) throws Exception {
		for(Integer ids:vo.getIds()){

			itemsService.deleteByPrimaryKey(ids);
        }
		return itemlist();
	}
	
	
	
	@RequestMapping("selectlist")
	public ModelAndView selectByNameandPrice(String name,float price) throws Exception {

		List<Items> list = itemsService.selectByNameandPrice(name,price);
		ModelAndView md = new ModelAndView();
		md.addObject("itemList", list);
		md.setViewName("selectlist");
		return md;

	}
	
	@RequestMapping("plxg")
	public ModelAndView piLianXiuGai(Integer ids[]) throws Exception {
		
		List<Items> list = new ArrayList<Items>();
		for(Integer id:ids){
			System.out.println("id="+id);
			list.add(itemsService.findItemById(id));
		}
		ModelAndView md = new ModelAndView();
		md.addObject("itemList", list);
		md.setViewName("editItem");

		return md;
	}
	
	
	@RequestMapping("login")
	public String  findUser(@RequestParam(value="username",required=false) String username,@RequestParam(value="password",required=false) String password,HttpServletRequest req)  {
		User user=userService.findUser(username, password);
		req.getSession().setAttribute("user", user);
		if(user!=null){
			return "forward:/list";
		}
		else{
			return "login";
		}

	}
	
	
}
