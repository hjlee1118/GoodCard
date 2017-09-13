package kr.co.goodcard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import kr.co.goodcard.vo.CreditCard;
import kr.co.goodcard.vo.mongo.AnnualFee;
import kr.co.goodcard.vo.mongo.Benefits;
import kr.co.goodcard.vo.mongo.LimitBenefit;
import kr.co.goodcard.vo.mongo.SpecialService;

@Controller
public class CardController {

	@RequestMapping("card/credit.do")
	public String creditCardTest(Model model) {
		try {
			List<CreditCard> creditCardList = creditCardTest();
			model.addAttribute("creditCardList", creditCardList);
			return "card/creditCardTest";
		} catch (Exception e) {

		}
		return "redirect:/";
	}

	public static List<CreditCard> creditCardTest() {

		try {

			MongoClient mongo = new MongoClient("13.124.174.15", 27017);
			DB db = mongo.getDB("hana");

			// get a single collection
			DBCollection collection = db.getCollection("creditCard");

			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("brand", "하나카드");

			DBCursor cursor = collection.find(searchQuery);

			List<CreditCard> list = new ArrayList<>();

			int index = 0;

			while (cursor.hasNext()) {

				BasicDBObject cardDBObject = (BasicDBObject) cursor.next();
				CreditCard creditCard = new CreditCard();

				creditCard.setId(cardDBObject.getString("_id"));
				creditCard.setBrand(cardDBObject.getString("brand"));
				creditCard.setCardType(cardDBObject.getString("cardType"));
				creditCard.setCardName(cardDBObject.getString("cardName"));
				creditCard.setAnnotation(cardDBObject.getString("annotation"));
				creditCard.setImagePath(cardDBObject.getString("imagePath"));
				creditCard.setAnnualFee((List<AnnualFee>) cardDBObject.get("annualFee"));
				creditCard.setLimitBenefit((List<LimitBenefit>) cardDBObject.get("limitBenefit"));
				creditCard.setSpecialServices((List<SpecialService>) cardDBObject.get("specialService"));
				creditCard.setBenefits((List<Benefits>) cardDBObject.get("benefits"));
				creditCard.setViewCount(cardDBObject.getInt("viewCount"));

				list.add(creditCard);
				index++;

			}

			mongo.close();

			return list;
			
		} catch (Exception e) {
		
		}
		return null;

	}
	
	public static void main(String[] args) {
		List<CreditCard> list = creditCardTest();
		
		System.out.println(list.get(0).getImagePath());
	}
}
