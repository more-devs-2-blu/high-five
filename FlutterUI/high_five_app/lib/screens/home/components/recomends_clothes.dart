import 'package:flutter/material.dart';
import 'package:high_five_app/screens/details/components/details_screen.dart';
import 'package:high_five_app/values/colors_palette.dart';
import 'package:high_five_app/values/constants.dart';

class RecomendsClothes extends StatelessWidget {
  const RecomendsClothes({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      scrollDirection: Axis.horizontal,
      child: Row(
        children: [
          RecomendClothesCard(
            image: "assets/images/primeira.jpg",
            title: "Vestido vermelho ",
            marca: "Vicci",
            price: 259,
            press: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => DetailsScreen(),
                ),
              );
            },
          ),
          RecomendClothesCard(
            image: "assets/images/segunda.jpg",
            title: "Blusa Branca",
            marca: "H!5",
            price: 159,
            press: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => DetailsScreen(),
                ),
              );
            },
          ),
          RecomendClothesCard(
            image: "assets/images/terceira.jpg",
            title: "Calça Jogger",
            marca: "Rust",
            price: 139,
            press: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => DetailsScreen(),
                ),
              );
            },
          ),
        ],
      ),
    );
  }
}

class RecomendClothesCard extends StatelessWidget {
  const RecomendClothesCard({
    Key? key,
    required this.image,
    required this.title,
    required this.marca,
    required this.price,
    required this.press,
  }) : super(key: key);

  final String image, title, marca;
  final int price;
  final Function() press;

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Container(
      margin: const EdgeInsets.only(
        top: kDefaultPadding / 2,
        left: kDefaultPadding,
        bottom: kDefaultPadding * 2.5,
      ),
      width: size.width * 0.49,
      child: Column(
        children: [
          ClipRRect(
            borderRadius: const BorderRadius.only(
                topLeft: Radius.circular(15), topRight: Radius.circular(15)),
            child: Image.asset(
              image,
            ),
          ),
          GestureDetector(
            onTap: press,
            child: Container(
              padding: const EdgeInsets.all(kDefaultPadding / 2),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: const BorderRadius.only(
                  bottomLeft: Radius.circular(10),
                  bottomRight: Radius.circular(15),
                ),
                boxShadow: [
                  BoxShadow(
                    offset: const Offset(0, 10),
                    blurRadius: 50,
                    color: ColorsPalette.kPrimaryColor.withOpacity(0.23),
                  )
                ],
              ),
              child: Row(
                children: [
                  RichText(
                    text: TextSpan(
                      children: [
                        TextSpan(
                          text: "$title\n".toUpperCase(),
                          style: Theme.of(context).textTheme.button,
                        ),
                        TextSpan(
                            text: marca.toUpperCase(),
                            style: TextStyle(
                              color:
                                  ColorsPalette.kPrimaryColor.withOpacity(0.5),
                            ))
                      ],
                    ),
                  ),
                  const Spacer(),
                  Text(
                    "R\$$price",
                    style: Theme.of(context)
                        .textTheme
                        .button!
                        .copyWith(color: ColorsPalette.kPrimaryColor),
                  )
                ],
              ),
            ),
          )
        ],
      ),
    );
  }
}
