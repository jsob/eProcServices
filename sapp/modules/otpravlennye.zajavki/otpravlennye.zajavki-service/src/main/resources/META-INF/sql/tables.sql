create table sapp.otpravlennye_zajavki (
	data_izmenenija DATE null,
	data_otpravki DATE null,
	izmenil LONG,
	izvewenie_id LONG,
	kolichestvo_otpravok LONG,
	lot_id LONG,
	otpravil LONG,
	otpravlennye_zajavki_id LONG not null primary key,
	postavwik_id LONG,
	status LONG
);