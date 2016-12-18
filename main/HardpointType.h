#ifndef HARDPOINTTYPE_H
#define HARDPOINTTYPE_H

#include <string>

class HardpointType
{
public:
    static const HardpointType BALLISTIC;
    static const HardpointType ENERGY;
    static const HardpointType MISSILE;
    static const HardpointType AMS;
    static const HardpointType ECM;
    static const HardpointType MASC;

private:
    enum class HardpointEnum;

    const HardpointEnum enumId;
    const std::string longName;
    const std::string shortName;

    HardpointType(const HardpointEnum & sectionType, const std::string & fullName, const std::string & abbreviation);
};

#endif // HARDPOINTTYPE_H
