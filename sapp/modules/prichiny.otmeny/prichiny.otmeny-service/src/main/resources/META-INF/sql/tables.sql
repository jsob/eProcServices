create table sapp.prichiny_otmeny (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	izmenil LONG,
	izvewenie_id LONG,
	prichina VARCHAR(75) null,
	prichiny_otmeny_id LONG not null primary key,
	sozdal LONG
);