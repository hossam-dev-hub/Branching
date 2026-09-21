package com.codwith_hossam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codwith_hossam.StaffModelskay;
import com.codwith_hossam.Service.StaffService;

import jakarta.validation.Valid;





@Controller  //تاني وهو يغلف الرد دي ويبعتو لي العميل تاني  Controller ويرجع الرد لي ال   Busnis يعمل ال  servic  هي استقبال الطلب وتبعتو لي ال  Controller ومهمت ال   Controller  عرفتو اني الكلاس دي 
public class Controllers {
	/* html Arraylist دي مشروع ال 
	List<StaffModels> mystaffnameall= Arrays.asList(
			new StaffModels(1,"hossam","engnerg",35000.55),
			new StaffModels(2, "Ahmed", "Backend Developer", 28000.00),
			new StaffModels(3, "Ali", "System Architect", 45000.75),
			new StaffModels(4, "Omar", "DevOps Engineer", 32000.00)
			);
			ودي اوامر اللي جواه  الداله اللي هتتنفذه اول ما تعمل طالب علي الويب 
			   model.addAttribute("mystaffnameall",mystaffnameall); // Model كده انا ربط البيانات بتعي بي ال 
	   return "Staff-ArrayListnamesall";  //   هيعرضه للمستخدم    +      دي الارجاع بتع الداله  Spring اللي ال   HTML  الداله دي بترجع نص والنص دي هو اسم ملف ال      
			*/
	
	       /* form مشروع ال 
	StaffModels Mystaff=new StaffModels(1,"hossam","engnerg",35000.55);//انشاء كائن علشان امهد القيم بتعت المتغيرات 
	
   @GetMapping("/staff-deatials")//  نفذه الداله دي علطول  staff-name  بقولو لما يحصل طلب علي 
    public String getStaffname(Model model) {  //  HTML. ينقلها من هنا يوديها لملف Spring وظيفات المتغير دي تحط فيا بيانات علشا ال  model يوفرو متغير اسمو  Spring برامتر بيطلب من ال   Model model ال 
	/*   StaffModels Mystaff=new StaffModels(1,"hossam","engnerg",35000.55);//انشاء كائن علشان امهد القيم بتعت المتغيرات 
	 * model.addAttribute("StaffModels",Mystaff); // Model كده انا ربط البيانات بتعي بي ال 
	 *   return "staff-deatials";  //   هيعرضه للمستخدم    +      دي الارجاع بتع الداله  Spring اللي ال   HTML  الداله دي بترجع نص والنص دي هو اسم ملف ال  
	      Arraylist   انا  كده  جبت بيانات موظف واحد عندي بس لو عايز بقي اجيب بقي الموظفين اللي عندي فا انا محتاج اعمل  */
	   
	   // Arraylist كود ال 

	  //   model.addAttribute("staff",Mystaff); // Model كده انا ربط البيانات بتعي بي ال 
	  // return "from";  //   هيعرضه للمستخدم    +      دي الارجاع بتع الداله  Spring اللي ال   HTML  الداله دي بترجع نص والنص دي هو اسم ملف ال      */
	    
	/* Format مشروع ال 
	// إنشاء قائمة فارغة من نوع ArrayList لتخزين كافة الموظفين فيها في الذاكرة
	List<StaffModels> AllStaff = new ArrayList<>();

	// تحديد مسار GET لعرض صفحة إضافة موظف جديد عند التوجه لهذا الرابط
	@GetMapping("/staff-deatials")
	public String addNewStaff(Model model) {
	    
	    // إنشاء كائن جديد فارغ وربطه بالـ Model ليمر إلى الـ Form في الـ HTML
	    model.addAttribute("addNewStaff", new StaffModels());
	    
	    // إرجاع اسم ملف الـ HTML الخاص بصفحة إضافة الموظف لعرضه للمستخدم
	    return "addnewstaff1";
	}

	// تحديد مسار POST لاستقبال البيانات المرسلة من الـ Form عند الضغط على زر الحفظ
	@PostMapping("/dataSubmitForm")
	public String dataSubmitForm(StaffModels staf) {
	    
	    // إضافة الموظف الجديد القادم من الفوّرم إلى القائمة
	    AllStaff.add(staf);
	    
	    // إعادة توجيه (Redirect) للمستخدم إلى مسار عرض كل الموظفين
	    return "redirect:/getAllstaff";
	}

	// تحديد مسار GET لعرض صفحة جدول الموظفين
	@GetMapping("/getAllstaff")
	public String getAllstaff(Model model) {
	    
	    // إرسال قائمة الموظفين كاملة إلى الـ Model ليعرضها الـ Thymeleaf في الجدول
	    model.addAttribute("allstaff", AllStaff);
	    
	    // إرجاع اسم ملف الـ HTML الخاص بصفحة عرض الجدول
	    return "getallstaffandadd";
	}  */
	
	/* From كود ال   
	// إنشاء قائمة فارغة من نوع ArrayList لتخزين كافة الموظفين فيها في الذاكرة
		List<StaffModelskay> AllStaff = new ArrayList<>();

		// تحديد مسار GET لعرض صفحة إضافة موظف جديد عند التوجه لهذا الرابط
		@GetMapping("/staff-deatialskay")
		
		    //  staff-details?id=5 مش بيتكرار  مثال:  QueryParameter كا  URL بنتظر متغير قادم من ال  Spring  تخبر ال  @RequestParam  معني كلمه    
		           //    ولن يرمي السيرفر خطأ.  null  هي  id  وإذا لم يرسله ستكون قيمة   id تعني أن هذا المتغير اختياري؛ إذا أرسله المستخدم في الرابط  سيتخزن  في المتغير required = false
		            //اسم المتغير ونوعه الذي سيستقبل القيمة الممررة في الرابط. String id
		public String addNewStaff(Model model,@RequestParam(required = false) String id) {
			StaffModelskay mystaff=new StaffModelskay(); //انشات كائن من كلاس البيانات 
			int index=getStaffIndex(id);
		    // إنشاء كائن جديد فارغ وربطه بالـ Model ليمر إلى الـ Form في الـ HTML
		    model.addAttribute("addNewStaffkay", index == -1 ? mystaff : AllStaff.get(index));
		    
		    // إرجاع اسم ملف الـ HTML الخاص بصفحة إضافة الموظف لعرضه للمستخدم
		    return "addnewstaffkay";
		}
		 public int getStaffIndex(String id) {
			 for(int i=0; i<AllStaff.size() ;i++) {
				 
				 if(AllStaff.get(i).getId().equals(id)) return i;
			 }
			 return -1;
		 }

		// تحديد مسار POST لاستقبال البيانات المرسلة من الـ Form عند الضغط على زر الحفظ
		@PostMapping("/dataSubmitFormkay")
		public String dataSubmitForm(@Valid @ModelAttribute("addNewStaffkay") StaffModelskay stafkay,BindingResult result) {
		   if(result.hasErrors()) return "addnewstaffkay";
			
			int index = getStaffIndex(stafkay.getId());
		    if(index == -1) {
		    	AllStaff.add(stafkay);
		    }
		    else {
		    	AllStaff.set(index, stafkay);
		    }
		    
		    // إعادة توجيه (Redirect) للمستخدم إلى مسار عرض كل الموظفين
		    return "redirect:/getAllstaffkay";
		}

		// تحديد مسار GET لعرض صفحة جدول الموظفين
		@GetMapping("/getAllstaffkay")
		public String getAllstaff(Model model) {
		    
		    // إرسال قائمة الموظفين كاملة إلى الـ Model ليعرضها الـ Thymeleaf في الجدول
		    model.addAttribute("allstaff", AllStaff);
		    
		    // إرجاع اسم ملف الـ HTML الخاص بصفحة عرض الجدول
		    return "getallstaffandaddkay";
		}*/
	
	/*   Service  قبل استخدام ال  layer Architecture 3 كود ال 
	 // واقدر اوصل لي البيانات دي عن طريف الكائن دي  database  انشاء كاين من الكلاس اللي في كل البيانات الخاصه بي ال 
	StafRepository stafRepository=new StafRepository();
	// تحديد مسار GET لعرض صفحة إضافة موظف جديد عند التوجه لهذا الرابط
			@GetMapping("/staff-deatialskay")
			
			    //  staff-details?id=5 مش بيتكرار  مثال:  QueryParameter كا  URL بنتظر متغير قادم من ال  Spring  تخبر ال  @RequestParam  معني كلمه    
			           //    ولن يرمي السيرفر خطأ.  null  هي  id  وإذا لم يرسله ستكون قيمة   id تعني أن هذا المتغير اختياري؛ إذا أرسله المستخدم في الرابط  سيتخزن  في المتغير required = false
			            //اسم المتغير ونوعه الذي سيستقبل القيمة الممررة في الرابط. String id
			public String addNewStaff(Model model,@RequestParam(required = false) String id) {
				StaffModelskay mystaff=new StaffModelskay(); //انشات كائن من كلاس البيانات 
				int index=getStaffIndex(id);
			    // إنشاء كائن جديد فارغ وربطه بالـ Model ليمر إلى الـ Form في الـ HTML
			    model.addAttribute("addNewStaffkay", index == -1 ? mystaff : stafRepository.getStaffByIndex(index));
			    
			    // إرجاع اسم ملف الـ HTML الخاص بصفحة إضافة الموظف لعرضه للمستخدم
			    return "addnewstaffkay";
			}
			
			public int getStaffIndex(String id) {
				 for(int i=0; i<stafRepository.getAllstaf().size() ;i++) {
					 
					 if(stafRepository.getStaffByIndex(i).getId().equals(id)) return i;
				 }
				 return -1;
			 }


			// تحديد مسار POST لاستقبال البيانات المرسلة من الـ Form عند الضغط على زر الحفظ
			@PostMapping("/dataSubmitFormkay")
			public String dataSubmitForm(@Valid @ModelAttribute("addNewStaffkay") StaffModelskay stafkay,BindingResult result) {
			   if(result.hasErrors()) return "addnewstaffkay";
				
				int index = getStaffIndex(stafkay.getId());
			    if(index == -1) {
			    	stafRepository.addStaf(stafkay);
			    }
			    else {
			     
			    	stafRepository.Updatestaf(stafkay, index);
			    }
			    
			    // إعادة توجيه (Redirect) للمستخدم إلى مسار عرض كل الموظفين
			    return "redirect:/getAllstaffkay";
			}
			// تحديد مسار GET لعرض صفحة جدول الموظفين
			@GetMapping("/getAllstaffkay")
			public String getAllstaff(Model model) {
			    
			    // إرسال قائمة الموظفين كاملة إلى الـ Model ليعرضها الـ Thymeleaf في الجدول
			    model.addAttribute("allstaff",stafRepository.getAllstaf() );
			    
			    // إرجاع اسم ملف الـ HTML الخاص بصفحة عرض الجدول
			    return "getallstaffandaddkay";
}  */
	
      /*  Service  بي استخدام ال  layer Architecture 3 كود ال 
	 // واقدر اوصل لي البيانات دي عن طريف الكائن دي  database  انشاء كاين من الكلاس اللي في كل البيانات الخاصه بي ال 
	StaffService Servic=new StaffService();
	// تحديد مسار GET لعرض صفحة إضافة موظف جديد عند التوجه لهذا الرابط
			@GetMapping("/staff-deatialskay")
			
			    //  staff-details?id=5 مش بيتكرار  مثال:  QueryParameter كا  URL بنتظر متغير قادم من ال  Spring  تخبر ال  @RequestParam  معني كلمه    
			           //    ولن يرمي السيرفر خطأ.  null  هي  id  وإذا لم يرسله ستكون قيمة   id تعني أن هذا المتغير اختياري؛ إذا أرسله المستخدم في الرابط  سيتخزن  في المتغير required = false
			            //اسم المتغير ونوعه الذي سيستقبل القيمة الممررة في الرابط. String id
			public String addNewStaff(Model model,@RequestParam(required = false) String id) {
			//	StaffModelskay mystaff=new StaffModelskay(); //انشات كائن من كلاس البيانات 
				//int index=Servic.getStaffIndex(id);
			    // إنشاء كائن جديد فارغ وربطه بالـ Model ليمر إلى الـ Form في الـ HTML
			    model.addAttribute("addNewStaffkay",Servic.getStaffById(id));
			    
			    // إرجاع اسم ملف الـ HTML الخاص بصفحة إضافة الموظف لعرضه للمستخدم
			    return "addnewstaffkay";
			}
			
			

			// تحديد مسار POST لاستقبال البيانات المرسلة من الـ Form عند الضغط على زر الحفظ
			@PostMapping("/dataSubmitFormkay")
			public String dataSubmitForm(@Valid @ModelAttribute("addNewStaffkay") StaffModelskay stafkay,BindingResult result) {
			   if(result.hasErrors()) return "addnewstaffkay";
				Servic.SubmitStaff(stafkay);
			    // إعادة توجيه (Redirect) للمستخدم إلى مسار عرض كل الموظفين
			    return "redirect:/getAllstaffkay";
			}
			// تحديد مسار GET لعرض صفحة جدول الموظفين
			@GetMapping("/getAllstaffkay")
			public String getAllstaff(Model model) {
			    
			    // إرسال قائمة الموظفين كاملة إلى الـ Model ليعرضها الـ Thymeleaf في الجدول
			    model.addAttribute("allstaff",Servic.getAllstaf() );
			    
			    // إرجاع اسم ملف الـ HTML الخاص بصفحة عرض الجدول
			    return "getallstaffandaddkay";
}    */
	
	// Beans & Dependency Injection  كواد ال  
	        @Autowired
	        StaffService Servic; 
		// تحديد مسار GET لعرض صفحة إضافة موظف جديد عند التوجه لهذا الرابط
				@GetMapping("/staff-deatialskay")
				
				    //  staff-details?id=5 مش بيتكرار  مثال:  QueryParameter كا  URL بنتظر متغير قادم من ال  Spring  تخبر ال  @RequestParam  معني كلمه    
				    //    ولن يرمي السيرفر خطأ.  null  هي  id  وإذا لم يرسله ستكون قيمة   id تعني أن هذا المتغير اختياري؛ إذا أرسله المستخدم في الرابط  سيتخزن  في المتغير required = false
		           //اسم المتغير ونوعه الذي سيستقبل القيمة الممررة في الرابط. String id
			public String addNewStaff(Model model,@RequestParam(required = false) String id) {
				//	StaffModelskay mystaff=new StaffModelskay(); //انشات كائن من كلاس البيانات 
					//int index=Servic.getStaffIndex(id);
				    // إنشاء كائن جديد فارغ وربطه بالـ Model ليمر إلى الـ Form في الـ HTML
      	    model.addAttribute("addNewStaffkay",Servic.getStaffById(id));
				    
				    // إرجاع اسم ملف الـ HTML الخاص بصفحة إضافة الموظف لعرضه للمستخدم
		    return "addnewstaffkay";
				}
				
				

				// تحديد مسار POST لاستقبال البيانات المرسلة من الـ Form عند الضغط على زر الحفظ
				@PostMapping("/dataSubmitFormkay")
				public String dataSubmitForm(@Valid @ModelAttribute("addNewStaffkay") StaffModelskay stafkay,BindingResult result) {
				   if(result.hasErrors()) return "addnewstaffkay";
					Servic.SubmitStaff(stafkay);
				    // إعادة توجيه (Redirect) للمستخدم إلى مسار عرض كل الموظفين
				    return "redirect:/getAllstaffkay";
				}
				// تحديد مسار GET لعرض صفحة جدول الموظفين
				@GetMapping("/getAllstaffkay")
				public String getAllstaff(Model model) {
				    
				    // إرسال قائمة الموظفين كاملة إلى الـ Model ليعرضها الـ Thymeleaf في الجدول
				    model.addAttribute("allstaff",Servic.getAllstaf() );
				    
				    // إرجاع اسم ملف الـ HTML الخاص بصفحة عرض الجدول
				    return "getallstaffandaddkay";
				}
}
