package tools.factory;

import tools.models.ProductReviewModel;

public class ReviewFactory {

	public static ProductReviewModel getReviewInstance() {

		ProductReviewModel review = new ProductReviewModel();
		review.setRatingStars("Rating_4");
		review.setNickname("Octavia");
		review.setSummary("Simba's final rest");
		review.setReview(
				"Simba's final rest Aug 28, 2012 Reviewed By: Nakema COn Aug 9th, I had to put my furry daughter to sleep. I was "
						+ "completely devastated as was my family. Simba had been a part of our lives for the past 17yrs. The crematory that the veterinarian uses wanted $170-175"
						+ "plus tax for an urn. Ridiculous. I googled pet urns & your website came up. I am absolutely pleased with my purchase. It arrived very quickly (2 days). It was here"
						+ " before Simba was even ready to come home. The girls at the vet's office were in awe. I would highly recommend your site. It made a difficult time a little more bearable."
						+ "With sincerest thanks!!");
		return review;
	}
}
