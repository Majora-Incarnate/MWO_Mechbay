#ifndef WEIGHTCLASS_H
#define WEIGHTCLASS_H

#include "string"

class WeightClass
{
public:
    static const WeightClass ASSAULT;
    static const WeightClass HEAVY;
    static const WeightClass MEDIUM;
    static const WeightClass SMALL;

private:
    enum class WeightEnum;

    const WeightEnum enumId;
    const std::string name;
    const int minimumWeight;
    const int maximumWeight;

    WeightClass(const WeightEnum & weightClass, const std::string & fullName, const int & minimum, const int & maximum);
};

#endif // WEIGHTCLASS_H
