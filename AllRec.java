package application.map;

import java.util.ArrayList;

import javafx.scene.layout.Pane;

public class AllRec {
	ArrayList<Rec> allRec = new ArrayList<Rec>();

	ArrayList<MediumRec> allMediumRec = new ArrayList<MediumRec>();

	ArrayList<SmallRec> allSmallRec = new ArrayList<SmallRec>();

	ArrayList<TinyRec> allTinyRec = new ArrayList<TinyRec>();

	ArrayList<TopMiddleRec> allTopMiddleRec = new ArrayList<TopMiddleRec>();

	ArrayList<CenterRec> allCenterRec = new ArrayList<CenterRec>();

	ArrayList<SkinnyHRec> allSkinnyHRec = new ArrayList<SkinnyHRec>();

	ArrayList<OutsideMiddleRec> allOutsideMiddleRec = new ArrayList<OutsideMiddleRec>();

	ArrayList<InsideMidRec> allInsideMidRec = new ArrayList<InsideMidRec>();

	ArrayList<VMiddleRec> allVMiddleRec = new ArrayList<VMiddleRec>();

	ArrayList<HMiddleRec> allHMiddleRec = new ArrayList<HMiddleRec>();

	ArrayList<MicroMiddleRec> allMicroMiddleRec = new ArrayList<MicroMiddleRec>();

	ArrayList<SideMMRec> allSideMMRec = new ArrayList<SideMMRec>();

	ArrayList<HalfVMiddleRec> allHalfVMiddleRec = new ArrayList<HalfVMiddleRec>();

	ArrayList<HalfHMiddleRec> allHalfHMiddleRec = new ArrayList<HalfHMiddleRec>();

	ArrayList<BottomLRRec> allBottomLRRec = new ArrayList<BottomLRRec>();

	public AllRec(Pane p) {
		allRec.add(new Rec(155, 175, p));//1TOPLeftSide
		allRec.add(new Rec(355, 175, p));//2TOPLeftSide
		allRec.add(new Rec(355, 275, p));//5TOPLeftSide
		allRec.add(new Rec(555, 175, p));//3TOPLeftSide
		allRec.add(new Rec(1305, 275, p));//5TOPRightSide
		allRec.add(new Rec(1100, 175, p));//1TOPRightSide
		allRec.add(new Rec(1300, 175, p));//2TOPRightSide
		allRec.add(new Rec(1500, 175, p));//3TOPRightSide
		allRec.add(new Rec(150, 580, p));//1BOTTOMLeftSide
		allRec.add(new Rec(1500, 580, p));//

		allMediumRec.add(new MediumRec(545, 580, p));//2//
		allMediumRec.add(new MediumRec(1120, 580, p));//3//
		allMediumRec.add(new MediumRec(380, 580, p));//1//
		allMediumRec.add(new MediumRec(1310, 580, p));//4//

		allSmallRec.add(new SmallRec(155, 285, p));//4TopLeftSide
		allSmallRec.add(new SmallRec(1500, 285, p));//6TOPRightSide
		allSmallRec.add(new SmallRec(150, 685, p));//4BottomLeftSide
		allSmallRec.add(new SmallRec(1500, 685, p));//6BottomRightSide

		allTinyRec.add(new TinyRec(555, 285, p));//5TopLeftSide
		allTinyRec.add(new TinyRec(1140, 285, p));//4TopRightSide

		allTopMiddleRec.add(new TopMiddleRec(752, 121, p));//LeftSideMiddle
		allTopMiddleRec.add(new TopMiddleRec(922, 121, p));//RightSideMiddle

		allCenterRec.add(new CenterRec(800, 400, p));//Directly in the Middle

		allSkinnyHRec.add(new SkinnyHRec(430, 690, p));//6BottomLeftSide
		allSkinnyHRec.add(new SkinnyHRec(1120, 690, p));//4BottomLeftSide

		allOutsideMiddleRec.add(new OutsideMiddleRec(1303, 380, p));//RightOutSideMiddle
		allOutsideMiddleRec.add(new OutsideMiddleRec(348, 380, p));

		allInsideMidRec.add(new InsideMidRec(555, 380, p));
		allInsideMidRec.add(new InsideMidRec(1125, 380, p));

		allVMiddleRec.add(new VMiddleRec(717, 505, p));
		allVMiddleRec.add(new VMiddleRec(1055, 505, p));

		allHMiddleRec.add(new HMiddleRec(790, 555, p));
		allHMiddleRec.add(new HMiddleRec(790, 670, p));

		allMicroMiddleRec.add(new MicroMiddleRec(887, 302, p));

		allSideMMRec.add(new SideMMRec(737, 352, p));
		allSideMMRec.add(new SideMMRec(1012, 352, p));

		allHalfVMiddleRec.add(new HalfVMiddleRec(712, 280, p));
		allHalfVMiddleRec.add(new HalfVMiddleRec(1055, 280, p));

		allHalfHMiddleRec.add(new HalfHMiddleRec(787, 280, p));

		allBottomLRRec.add(new BottomLRRec(355, 580, p));
		allBottomLRRec.add(new BottomLRRec(1430, 580, p));
//		
//		.add(new (, , p));
	}
}